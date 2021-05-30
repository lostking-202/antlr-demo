package org.antlr.demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/** 离线探索中表信息的描述，主要描述表中列的类型。这里与 feature zero 内部配置格式保持一致。 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class EntityInfo {
  /** 表中每个列的实际类型及特征类型 */
  private List<EntityColumnInfo> features;
  /** 表名，理论上可以通过上层的 key 获得，这里和 feature zero 内部配置格式保持一致。 */
  private String entityName;
}
