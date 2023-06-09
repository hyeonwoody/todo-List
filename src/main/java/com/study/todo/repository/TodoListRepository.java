package com.study.todo.repository;

import com.study.todo.entity.Todo;
import com.study.todo.entity.TodoList;
import com.study.todo.entity.TodoListTodos;
import com.study.todo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.Optional;

@Repository //DB Entity 입력 수정 삭제 조회
public interface TodoListRepository extends JpaRepository<TodoList, BigInteger> {
    TodoList findByOwnerId(BigInteger id);
}
