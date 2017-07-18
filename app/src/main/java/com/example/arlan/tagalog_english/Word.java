package com.example.arlan.tagalog_english;

/**
 * Created by arlan on 4/10/2017.
 */

import android.util.Log;

/**
 * {@link Word} represents a vocabulary word that the user wants to learn.
 * It contains a default translation, a English translation, and an image for that word.
 */
public class Word {

    /** Default translation for the word */
    private String mDefaultTranslation;

    /** English translation for the word */
    private String mEnglishTranslation;

    /** Audio resource ID for the word */
    private int mAudioResourceId;

    /** Image resource ID for the word */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this word */
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param englishTranslation is the word in the English language
     * @param audioResourceId is the resource ID for the audio file associated with this word
     */
    public Word(String defaultTranslation, String englishTranslation, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mEnglishTranslation = englishTranslation;
        mAudioResourceId = audioResourceId;
        Log.v("arvinsTag","TEST: "+mDefaultTranslation);
    }

    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param englishTranslation is the word in the English language
     * @param imageResourceId is the drawable resource ID for the image associated with the word
     * @param audioResourceId is the resource ID for the audio file associated with this word
     */
    public Word(String defaultTranslation, String englishTranslation, int imageResourceId,
                int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mEnglishTranslation = englishTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
        Log.v("arvinsTag","TEST: "+mDefaultTranslation);
    }

    /**
     * Get the default translation of the word.
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Get the English translation of the word.
     */
    public String getEnglishTranslation() {
        return mEnglishTranslation;
    }

    /**
     * Return the image resource ID of the word.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    /**
     * Return the audio resource ID of the word.
     */
    public int getAudioResourceId() {
        return mAudioResourceId;
    }
}
