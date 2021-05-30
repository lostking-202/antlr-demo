package org.antlr.demo;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/** 离线探索中表和表之间的关系定义 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class RelationInfo {

  /**
   * 关系类型，不同的表关系会对应不同的OP候选
   *
   * <p>支持1-1，1-M，SLICE三种类型
   */
  private String type;

  /** 针对时序型OP使用的窗口列表，如["10:0", "100:0", "1d,1000:0s"] */
  @JsonAlias("time_windows")
  private List<String> timeWindows = new ArrayList<>();

  /** 时间窗口的下界，类似 "0s", "1d", "2h" 这样。timeWindows不为空则直接使用，否则使用window_delay生成time_windows，2.1.1 添加 */
  @JsonAlias("window_delay")
  private String windowDelay = "";

  /** 左表名。通常来说from_xxx表示主表的相关信息 */
  @JsonAlias("from_entity")
  private String fromEntity;

  /** 左表拼接键，不能留空 */
  @JsonAlias("from_entity_keys")
  private List<String> fromEntityKeys = new ArrayList<>();

  /** 左表的时间戳列名，配""表示非时序数据，示例："date" */
  @JsonAlias("from_entity_time_col")
  private String fromEntityTimeCol = "";

  /** 右表名 */
  @JsonAlias("to_entity")
  private String toEntity;

  /** 右表拼接键，数量必须跟左表拼接键一致 */
  @JsonAlias("to_entity_keys")
  private List<String> toEntityKeys = new ArrayList<>();

  @JsonAlias("to_entity_time_col")
  /** 右表的时间戳列名，存在或留空必须与左表一致 */
  private String toEntityTimeCol;
}
