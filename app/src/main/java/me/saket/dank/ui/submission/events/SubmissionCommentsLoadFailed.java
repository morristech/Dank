package me.saket.dank.ui.submission.events;

import me.saket.dank.ui.UiEvent;

public class SubmissionCommentsLoadFailed implements UiEvent {

  public static SubmissionCommentsLoadFailed create() {
    return new SubmissionCommentsLoadFailed();
  }
}
