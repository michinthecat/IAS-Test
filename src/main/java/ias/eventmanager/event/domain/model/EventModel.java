package ias.eventmanager.event.domain.model;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table("events")
public class EventModel {

    @NotNull
    @NotBlank
    @Id
    private Integer id;

    @NotNull
    @NotBlank
    @Column("name")
    private String name;

    @NotNull
    @NotBlank
    @Column("date")
    private String date;

    @NotNull
    @NotBlank
    @Column("location")
    private String location;

}
