package application.repository;

import org.springframework.data.repository.CrudRepository;

import application.model.tarefa;

public interface TarefaRepository extends CrudRepository<tarefa, Long>{
    
}
