package com.homework.homework.dal.schedule;


import com.homework.homework.dal.event.Event;
import lombok.*;
import javax.persistence.*;
import java.util.LinkedList;
import java.util.List;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "schedule")
public class Schedule {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "hibernate_sequence")
    @SequenceGenerator(name = "hibernate_sequence", sequenceName = "hibernate_sequence", allocationSize = 10)
    Long id;

    String name;

    @OneToMany(mappedBy = "schedule", cascade = CascadeType.ALL)
    List<Event> events = new LinkedList<>();

}
