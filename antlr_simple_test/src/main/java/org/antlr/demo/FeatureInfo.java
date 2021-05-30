package org.antlr.demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class FeatureInfo {
  /** 主表表名，如 "sample" */
  private String targetEntity;
  /** 主表的主键列名 */
  private String targetEntityIndex;
  /** label 列名，由于 label 可能在副表上，此处需要表名，如 "sample.label" */
  private String targetLabel;
  /** 用来做单表OP的主时间列，此列必须在主表上，所以只有列名，如 "date" */
  private String targetPivotTimestamp;
  /** 表信息，表名为 Key，信息为 Value，主要包含表的特征信息 */
  private Map<String, EntityInfo> entityDetail = new HashMap<>();
  /** 表与表之间的关系，诸如按哪个列拼接，行之间是一对多还是其它什么关系 */
  private List<RelationInfo> relations = new ArrayList<>();
  /**
   * 所有表名，此处指定的是 entityDetail 里使用的表名，它的顺序需要与 ExploreConfig 里的 tables 对应，只是主表只包含一次 即：[0] => 主表，[1] =>
   * 反馈表，[2..] => BO 表
   *
   * <p>可以理解成 tables 提供了数据本身，但如何对应到 feature zero 并不清楚，因此根据顺序 map 到 entityNames 供后续 FeatureZero 使用
   */
  private List<String> entityNames = new ArrayList<>();

  public String getTargetLabelCode() {
    return String.format("Label(%s)", this.targetLabel);
  }
}
