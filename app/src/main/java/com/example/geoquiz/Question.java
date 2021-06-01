package com.example.geoquiz;

public class Question {
    private int mTextRestId;
    private boolean mAnswerTrue;

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setTextRestId(int textRestId) {
        mTextRestId = textRestId;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }

    public int getTextRestId() {
        return mTextRestId;
    }


    public Question(int textRestId, boolean answerTrue){
        mTextRestId= textRestId;
        mAnswerTrue= answerTrue;
    }
}
