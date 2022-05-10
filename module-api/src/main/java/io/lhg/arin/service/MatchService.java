package io.lhg.arin.service;

import io.lhg.arin.match.Match;
import io.lhg.arin.match.MatchRepository;
import io.lhg.arin.controller.MatchRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MatchService {

    private final MatchRepository matchRepository;

    public List<Match> getAllMatches() {
        return matchRepository.findAll();
    }

    public void insertMatch(MatchRequestDto matchRequestDto) {
        matchRepository.save(Match.builder()
                .teamName(matchRequestDto.getTeamName())
                .matchDate(matchRequestDto.getDate())
                .build());
    }
}
