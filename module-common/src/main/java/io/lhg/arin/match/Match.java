package io.lhg.arin.match;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;
import java.time.LocalDate;

@NoArgsConstructor
@Getter
@Entity
@Table(name = "match")
public class Match {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;




    @Column(name = "match_date")
    private LocalDate matchDate;

    @Column(name = "team_name")
    private String teamName;

    @Column(name = "status")
    private String status;

    @Builder
    public Match(LocalDate matchDate, String teamName, String status) {
        this.matchDate = matchDate;
        this.teamName = teamName;
        this.status = status;
    }
}