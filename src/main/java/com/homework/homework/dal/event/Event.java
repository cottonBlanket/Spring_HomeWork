package com.homework.homework.dal.event;

import com.homework.homework.dal.schedule.Schedule;
import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "event")
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "hibernate_sequence")
    @SequenceGenerator(name = "hibernate_sequence", sequenceName = "hibernate_sequence", allocationSize = 10)
    Long id;

    String name;

    @ManyToOne()
    @JoinColumn(name = "schedule_id")
    Schedule schedule;
}
