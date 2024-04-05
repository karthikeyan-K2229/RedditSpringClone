import { TestBed } from '@angular/core/testing';

import { SubredditserviceService } from '../services/subredditservice.service';

describe('SubredditserviceService', () => {
  let service: SubredditserviceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(SubredditserviceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
