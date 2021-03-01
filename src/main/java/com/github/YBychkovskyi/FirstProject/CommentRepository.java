package com.github.YBychkovskyi.FirstProject;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<TableComment, Integer> {
}
