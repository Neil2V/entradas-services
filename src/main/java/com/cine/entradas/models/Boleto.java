package com.cine.entradas.models;


import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;

@Entity
public class Boleto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private User user;

    private Sala sala;

    @OneToOne
    @JoinColumn(name = "User_dni", nullable = false)
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @OneToOne
    @JoinColumn(name = "Sala_id", nullable = false)
    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }
}
