package org.hamsafar.hamsafar.model;

import io.leangen.graphql.annotations.types.GraphQLType;
import lombok.*;
import org.hamsafar.hamsafar.model.audits.AuditModel;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Set;

@Data
@Builder
@Document
@GraphQLType
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class Place extends AuditModel {
    @DBRef
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Admin admin;

    @DBRef
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Tag tag;

    @DBRef
    @Indexed
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private City city;

    private String title;
    private String header;
    private String detail;
    private String rules;

    private Float lat;
    private Float lng;
    private Integer checkInRadius;

    private Boolean isAd;
    private Integer adViews;
    private Integer adLimit;

    private Float rate;

    @DBRef(lazy = true)
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Set<Event> events;

    @DBRef(lazy = true)
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Set<Feedback> feedbacks;

    @DBRef(lazy = true)
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Set<User> views;

    @DBRef(lazy = true)
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Set<User> checkedIns;

    @DBRef(lazy = true)
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Set<User> books;

    @DBRef(lazy = true)
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Set<Picture> pictures;

    @DBRef(lazy = true)
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Set<Video> videos;
}
