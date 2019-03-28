package com.dennisdavydov.mishpahug.models;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class EventsDescription {

    @SerializedName("content")
    @Expose
    private List<Event> events = null;
    @SerializedName("totalElements")
    @Expose
    private Long totalElements;
    @SerializedName("totalPages ")
    @Expose
    private Long totalPages;
    @SerializedName("size ")
    @Expose
    private Long size;
    @SerializedName("number ")
    @Expose
    private Long number;
    @SerializedName("numberOfElements ")
    @Expose
    private Long numberOfElements;
    @SerializedName("first ")
    @Expose
    private Boolean first;
    @SerializedName("last")
    @Expose
    private Boolean last;
    @SerializedName("sort")
    @Expose
    private Object sort;

    /**
     * No args constructor for use in serialization
     *
     */
    public EventsDescription() {
    }

    /**
     *
     * @param events
     * @param sort
     * @param numberOfElements
     * @param last
     * @param totalElements
     * @param number
     * @param first
     * @param totalPages
     * @param size
     */
    public EventsDescription(List<Event> events, Long totalElements, Long totalPages, Long size, Long number, Long numberOfElements, Boolean first, Boolean last, Object sort) {
        super();
        this.events = events;
        this.totalElements = totalElements;
        this.totalPages = totalPages;
        this.size = size;
        this.number = number;
        this.numberOfElements = numberOfElements;
        this.first = first;
        this.last = last;
        this.sort = sort;
    }

    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> content) {
        this.events = content;
    }

    public EventsDescription withContent(List<Event> events) {
        this.events = events;
        return this;
    }

    public Long getTotalElements() {
        return totalElements;
    }

    public void setTotalElements(Long totalElements) {
        this.totalElements = totalElements;
    }

    public EventsDescription withTotalElements(Long totalElements) {
        this.totalElements = totalElements;
        return this;
    }

    public Long getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(Long totalPages) {
        this.totalPages = totalPages;
    }

    public EventsDescription withTotalPages(Long totalPages) {
        this.totalPages = totalPages;
        return this;
    }

    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public EventsDescription withSize(Long size) {
        this.size = size;
        return this;
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public EventsDescription withNumber(Long number) {
        this.number = number;
        return this;
    }

    public Long getNumberOfElements() {
        return numberOfElements;
    }

    public void setNumberOfElements(Long numberOfElements) {
        this.numberOfElements = numberOfElements;
    }

    public EventsDescription withNumberOfElements(Long numberOfElements) {
        this.numberOfElements = numberOfElements;
        return this;
    }

    public Boolean getFirst() {
        return first;
    }

    public void setFirst(Boolean first) {
        this.first = first;
    }

    public EventsDescription withFirst(Boolean first) {
        this.first = first;
        return this;
    }

    public Boolean getLast() {
        return last;
    }

    public void setLast(Boolean last) {
        this.last = last;
    }

    public EventsDescription withLast(Boolean last) {
        this.last = last;
        return this;
    }

    public Object getSort() {
        return sort;
    }

    public void setSort(Object sort) {
        this.sort = sort;
    }

    public EventsDescription withSort(Object sort) {
        this.sort = sort;
        return this;
    }


}
