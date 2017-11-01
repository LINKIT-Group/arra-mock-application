import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpModule } from '@angular/http';

import { AppComponent } from './app.component';
import { AppRandomPhraseComponent } from './app-random-phrase/app-random-phrase.component';
import { PhraseService } from './phrase.service';
import { AppMaterialModule} from './app-material/app-material.module';

@NgModule({
  declarations: [
    AppComponent,
    AppRandomPhraseComponent
  ],
  imports: [
    BrowserModule,
    HttpModule,
    AppMaterialModule
  ],
  providers: [PhraseService],
  bootstrap: [AppComponent]
})
export class AppModule { }
