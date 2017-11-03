import { async, ComponentFixture, TestBed } from '@angular/core/testing';
import { BrowserModule } from '@angular/platform-browser';

import { AppRandomPhraseComponent } from './app-random-phrase.component';
import { AppMaterialModule } from '../app-material/app-material.module';
import { PhraseService } from '../phrase.service';
import { HttpModule } from '@angular/http';

describe('AppRandomPhraseComponent', () => {
  let component: AppRandomPhraseComponent;
  let fixture: ComponentFixture<AppRandomPhraseComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      imports: [AppMaterialModule, HttpModule],
      declarations: [AppRandomPhraseComponent],
      providers: [PhraseService]
    })
      .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AppRandomPhraseComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
