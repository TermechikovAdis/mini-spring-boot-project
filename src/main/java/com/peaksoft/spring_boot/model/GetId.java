package com.peaksoft.spring_boot.model;

import javax.persistence.*;

@Entity
@Table
public class GetId {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "get_id")
    private Long get_id;

    public GetId(Long get_id) {
        this.get_id = get_id;
    }

    public GetId() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getGet_id() {
        return get_id;
    }

    public void setGet_id(Long get_id) {
        this.get_id = get_id;
    }
}