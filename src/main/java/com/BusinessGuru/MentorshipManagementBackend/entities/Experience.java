package com.BusinessGuru.MentorshipManagementBackend.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Entity
@Table(name = "experience")
@NoArgsConstructor
@AllArgsConstructor
public class Experience {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String orgName;
    private String position;
    private String description;

    private Date fromDate;

    private Date toDate;

    @ManyToOne
    @JoinColumn(name = "user_profile_id")
    @JsonIgnore
    private UserProfile userProfile;
}