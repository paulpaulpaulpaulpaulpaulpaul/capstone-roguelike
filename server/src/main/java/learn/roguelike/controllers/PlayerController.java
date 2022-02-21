package learn.roguelike.controllers;

import learn.roguelike.domain.PlayerService;
import learn.roguelike.models.Player;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rl/player")

public class PlayerController {

    private final PlayerService service;

    public PlayerController(PlayerService service){
        this.service = service;
    }

    @GetMapping
    public List<Player> getPlayers(){
        List<Player> players = service.findAll();
        return players;
    }

}