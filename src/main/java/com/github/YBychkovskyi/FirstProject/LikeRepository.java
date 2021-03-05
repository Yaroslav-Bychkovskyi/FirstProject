package com.github.YBychkovskyi.FirstProject;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LikeRepository extends JpaRepository<TableLike, Integer> {
}
