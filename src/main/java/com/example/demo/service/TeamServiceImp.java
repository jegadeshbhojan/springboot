package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import com.example.demo.entity.Team;
import com.example.demo.repository.TeamRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class TeamServiceImp implements TeamService {

    @Autowired
    TeamRepository teamRepository;

    public Team createTeam(Team team) {
        return teamRepository.save(team);
    }

    public List<Team> getTeams() {
        return (List<Team>) teamRepository.findAll();
    }

    public Team findByTeamId(Long id) {
        return teamRepository.findById(id).get();
    }

    public Team updateTeam(Long id,Team team) {
        Team t = teamRepository.getOne(id);
        t.setTeamname(team.getTeamname());
        return teamRepository.save(t);
    }

    public void deleteTeamById(Long id) {
        teamRepository.deleteById(id);
    }

  

}
