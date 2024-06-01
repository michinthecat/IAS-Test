package ias.eventmanager.user.domain.model;

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
@Table("user")
public class UserModel {

    @NotNull
    @NotBlank
    @Id
    private Integer id;

    @NotNull
    @NotBlank
    @Column("name")
    private String name;

    @NotNull(message = "El Id del Evento no puede ser nulo")
    @NotBlank
    @Column("id_event")
    private String idEvent;

}
