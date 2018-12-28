package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Team;



public interface TeamService {

    public Team createTeam(Team team);
    public List<Team> getTeams();
    public Team findByTeamId(Long id);
    public Team updateTeam(Long id,Team team);
    public void deleteTeamById(Long id); 

}
