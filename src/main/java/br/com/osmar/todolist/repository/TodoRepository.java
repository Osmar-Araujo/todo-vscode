package br.com.osmar.todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.osmar.todolist.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {

}
