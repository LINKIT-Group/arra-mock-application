import { Injectable } from '@angular/core';
import { Headers, Http } from '@angular/http';
import { Phrase } from './phrase.model';

import 'rxjs/add/operator/toPromise';
import { environment } from '../environments/environment';

@Injectable()
export class PhraseService {

  // TODO: move to environment
  private statelessServer = environment != null && environment.statelessServer != null ? environment.statelessServer : 'http://localhost';
  private statefulServer = environment != null && environment.statefulServer != null ? environment.statefulServer : 'http://localhost';

  private randomPhraseUrl = '/phrases/random';
  private countPhraseUrl = '/phrases/{id}/count';
  private countUrlRegex = /{id}/gi;

  constructor(private http: Http) { }

  getRandomPhrase(): Promise<Phrase> {

    console.log('Url: ' + this.statelessServer + this.randomPhraseUrl);
    return this.http.get(this.statelessServer + this.randomPhraseUrl)
      .toPromise()
      .then(response => response.json() as Phrase)
      .catch(this.handleError);
  }

  getPhraseCount(id: number): Promise<number> {
    const urlPattern = this.statefulServer + this.countPhraseUrl;
    const url = urlPattern.replace(this.countUrlRegex, id.toString());
    return this.http.get(url)
      .toPromise()
      .then(response => response.json().count)
      .catch(this.handleError);
  }

  private handleError(error: any): Promise<any> {
    console.error('An error occurred', error);
    return Promise.reject(error.message || error);
  }
}
