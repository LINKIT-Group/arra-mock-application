import { NgModule } from '@angular/core';
import { MatButtonModule, MatCardModule, MatGridListModule } from '@angular/material';


@NgModule({
  imports: [
    MatButtonModule, MatCardModule, MatGridListModule
  ],
  exports: [MatButtonModule, MatCardModule, MatGridListModule]
})
export class AppMaterialModule { }
