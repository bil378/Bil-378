package com.ITCollaboration.ITCollaboration.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "Temp")
public class TempEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String name;
    private String email;

    public TempEntity() {
    }

    public TempEntity(Long id, String name, String population) {

        this.name = name;
        this.email = population;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.name);
        hash = 79 * hash + Objects.hashCode(this.email);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final TempEntity other = (TempEntity) obj;
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        return false;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("TempEntity{");
        sb.append(", name='").append(name).append('\'');
        sb.append(", email=").append(email);
        sb.append('}');
        return sb.toString();
    }
}
