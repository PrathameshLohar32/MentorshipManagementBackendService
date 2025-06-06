package com.BusinessGuru.MentorshipManagementBackend.Blogs.entities;

import com.BusinessGuru.MentorshipManagementBackend.commons.BaseEntity;
import com.BusinessGuru.MentorshipManagementBackend.entities.UserProfile;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "comments")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Comment extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;


    private String userId;

    @ManyToOne
    @JoinColumn(name = "blog_id", nullable = false)
    @JsonIgnore
    private Blog blog;

    private String comment;
}
