package com.tileapi.entity;

import com.google.common.base.Preconditions;
import org.apache.commons.lang.StringUtils;

import java.time.LocalDate;
import java.time.LocalDateTime;

import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Created by binita on 09/03/15.
 */
public class Tile {

    private String label;
    private int position;
    private LocalDateTime startDate;
    private LocalDateTime endDate;

    public Tile(String label, int position, LocalDateTime startDate, LocalDateTime endDate) {
        checkArgument(StringUtils.isNotBlank(label), "Label cannot be blank");
        checkArgument(StringUtils.isAlphanumericSpace(label),"Only alphanumeric and space allowed in label");
        checkArgument(label.length()<=30,"Label must not be more than 30 characters");
        checkArgument(position>=1 && position<=8,"Position must be greater than 1 and less than 8");
        this.label = label;
        this.position = position;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Tile(String label, int position) {
        checkArgument(StringUtils.isNotBlank(label), "Label cannot be blank");
        checkArgument(StringUtils.isAlphanumericSpace(label),"Only alphanumeric and space allowed in label");
        checkArgument(label.length()<=30,"Label must not be more than 30 characters");
        checkArgument(position>=1 && position<=8,"Position must be greater than 1 and less than 8");
        this.label = label;
        this.position = position;
    }
    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tile)) return false;

        Tile tile = (Tile) o;

        if (position != tile.position) return false;
        if (endDate != null ? !endDate.equals(tile.endDate) : tile.endDate != null) return false;
        if (label != null ? !label.equals(tile.label) : tile.label != null) return false;
        if (startDate != null ? !startDate.equals(tile.startDate) : tile.startDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = label != null ? label.hashCode() : 0;
        result = 31 * result + position;
        result = 31 * result + (startDate != null ? startDate.hashCode() : 0);
        result = 31 * result + (endDate != null ? endDate.hashCode() : 0);
        return result;
    }

}
