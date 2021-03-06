package com.bandwidth.sdk.xml.elements;

import com.bandwidth.sdk.exception.XMLInvalidTagContentException;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

@XmlRootElement(name = "PlayAudio")
public class PlayAudio implements Elements {
    
    private String audioUrl;
    private String digits;

    public PlayAudio() {
        super();
    }

    public PlayAudio(final String audioUrl) throws XMLInvalidTagContentException {
        setAudioUrl(audioUrl);
    }

    public PlayAudio(final String audioUrl, final String digits) throws XMLInvalidTagContentException {
        setAudioUrl(audioUrl);
        setDigits(digits);
    }

    @XmlValue
    public String getAudioUrl() {
        return audioUrl;
    }

    public void setAudioUrl(final String audioUrl) throws XMLInvalidTagContentException {
        if ((audioUrl == null) || (audioUrl.trim().isEmpty())) {
            throw new XMLInvalidTagContentException("Tag <PlayAudio> content (audioUrl) mustn't not be empty or null");
        }
        this.audioUrl = audioUrl;
    }

    @XmlAttribute(name = "digits")
    public String getDigits() {
        return digits;
    }

    public void setDigits(final String digits) {
        this.digits = digits;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PlayAudio{");
        sb.append("audioUrl='").append(audioUrl).append('\'');
        sb.append(", digits='").append(digits).append('\'');
        sb.append('}');
        return sb.toString();
    }
}