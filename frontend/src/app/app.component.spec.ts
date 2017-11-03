import { TestBed, async } from '@angular/core/testing';
import { AppComponent } from './app.component';
import { AppMaterialModule } from './app-material/app-material.module';
import { PhraseService } from './phrase.service';
import { HttpModule } from '@angular/http';
import { AppRandomPhraseComponent } from './app-random-phrase/app-random-phrase.component';

describe('AppComponent', () => {
  beforeEach(async(() => {
    TestBed.configureTestingModule({
      imports: [HttpModule,
        AppMaterialModule],
      declarations: [
        AppComponent,
        AppRandomPhraseComponent
      ], providers: [PhraseService]
    }).compileComponents();
  }));
  it('should create the app', async(() => {
    const fixture = TestBed.createComponent(AppComponent);
    const app = fixture.debugElement.componentInstance;
    expect(app).toBeTruthy();
  }));
  it(`should have as title '25 best phrases from Albert Einstein'`, async(() => {
    const fixture = TestBed.createComponent(AppComponent);
    const app = fixture.debugElement.componentInstance;
    expect(app.title).toEqual('25 best phrases from Albert Einstein');
  }));
  it('should render title', async(() => {
    const fixture = TestBed.createComponent(AppComponent);
    fixture.detectChanges();
    const compiled = fixture.debugElement.nativeElement;
    expect(compiled.querySelector('.mat-headline').textContent).toContain('Welcome to 25 best phrases from Albert Einstein!');
  }));
});
