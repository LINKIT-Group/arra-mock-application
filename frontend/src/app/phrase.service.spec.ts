import { TestBed, inject } from '@angular/core/testing';

import { PhraseService } from './phrase.service';
import { HttpModule } from '@angular/http';

describe('PhraseServiceService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      imports: [HttpModule],
      providers: [PhraseService]
    });
  });

  it('should be created', inject([PhraseService], (service: PhraseService) => {
    expect(service).toBeTruthy();
  }));
});
