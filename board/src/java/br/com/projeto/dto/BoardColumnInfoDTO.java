package src.java.br.com.projeto.dto;

import src.java.br.com.projeto.persistence.entity.BoardColumnKindEnum;

public record BoardColumnInfoDTO(Long id, int order, BoardColumnKindEnum kind) {
}
