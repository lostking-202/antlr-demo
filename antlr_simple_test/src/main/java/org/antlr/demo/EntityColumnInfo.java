package org.antlr.demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/** 离线探索中，表的列信息 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class EntityColumnInfo {
  /** 表名+列名组成的id，如果数据是parquet的话，此处的列名必须与数据中的schema一致，注意 schema 中应该是 "user_id" 而不是"sample.user_id" */
  private String id;

  /**
   * 特征的业务类型
   *
   * <p>支持 SingleString, Timestamp, Date, DiscreteNum, ContinueNum, ArrayString, KVNum, KVString,
   * SplitID
   */
  private String dataType;

  /** 是否忽略当前列 */
  @Builder.Default private boolean skip = false;

  /**
   * 列的存储类型，是feql使用的字段
   *
   * <p>支持 Int, String, SmallInt, BigInt, Float, Double, Date, Timestamp
   */
  private String featureType;
}
