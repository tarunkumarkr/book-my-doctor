    package com.tekpyramid.doctor.Entity;

    import jakarta.persistence.*;
    import lombok.*;

    @Builder
    @Setter
    @Getter
    @EqualsAndHashCode
    @NoArgsConstructor
    @AllArgsConstructor
    @Entity
    public class Admin {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private int id;
        private String userName;
        private String password;
        @ManyToOne
        @JoinColumn(name = "role_id")
        private Role role;


    }
