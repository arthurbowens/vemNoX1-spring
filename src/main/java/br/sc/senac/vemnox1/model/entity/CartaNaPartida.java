package br.sc.senac.vemnox1.model.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;

@Entity
public class CartaNaPartida {

    @EmbeddedId
    private CartaNaPartidaPk id;

    @ManyToOne
    @MapsId("idCarta")
    @JoinColumn(name = "id_carta")
    Carta carta;

    @ManyToOne
    @MapsId("idPartida")
    @JoinColumn(name = "id_partida")
    Partida partida;

    private boolean pertenceAoJogador;
    private boolean utilizada;
}