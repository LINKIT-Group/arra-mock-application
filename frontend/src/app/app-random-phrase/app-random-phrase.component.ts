import { Component, OnInit } from '@angular/core';
import { PhraseService } from '../phrase.service';
import { Phrase } from '../phrase.model';

@Component({
  selector: 'app-random-phrase',
  templateUrl: './app-random-phrase.component.html',
  styleUrls: ['./app-random-phrase.component.css']
})
export class AppRandomPhraseComponent implements OnInit {

  errorPhrase: Phrase = new Phrase(-1, 'Something went wrong, please try again latter.');

  phrase: Phrase = new Phrase(0, 'E = mc2');
  count: Number = 0;

  constructor(private phraseService: PhraseService) { }

  ngOnInit() {
    this.getPhrase();
  }

  getPhrase() {
    this.phraseService.getRandomPhrase()
      .then(phrase => {
        this.phrase = phrase;
        if (this.phrase.id !== this.errorPhrase.id) {
          this.phraseService.getPhraseCount(this.phrase.id).then(count => this.count = count);
        }
      })
      .catch(() => { this.phrase = this.errorPhrase; });

  }

  private handleError(error: any): Promise<any> {
    console.error('An error occurred', error); // for demo purposes only
    return Promise.reject(error.message || error);
  }

}
