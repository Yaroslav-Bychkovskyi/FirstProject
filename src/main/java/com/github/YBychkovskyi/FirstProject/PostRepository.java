package com.github.YBychkovskyi.FirstProject;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<TablePost, Integer> {

}
