package org.littletonrobotics.networkalerts;

import edu.wpi.first.shuffleboard.api.data.DataType;
import edu.wpi.first.shuffleboard.api.plugin.Description;
import edu.wpi.first.shuffleboard.api.plugin.Plugin;
import edu.wpi.first.shuffleboard.api.widget.ComponentType;
import edu.wpi.first.shuffleboard.api.widget.WidgetType;

import java.util.List;
import java.util.Map;

/**
 * A plugin for displaying persistent alerts sent over NetworkTables.
 */
@Description(group = "org.littletonrobotics", name = "NetworkAlerts", version = "1.0.0", summary = "A plugin for displaying persistent alerts sent over NetworkTables.")
public final class NetworkAlertsPlugin extends Plugin {

  @Override
  public List<DataType> getDataTypes() {
    return List.of(AlertsDataType.Instance);
  }

  @Override
  public List<ComponentType> getComponents() {
    return List.of(WidgetType.forAnnotatedWidget(AlertsWidget.class));
  }

  @Override
  public Map<DataType, ComponentType> getDefaultComponents() {
    return Map.of(AlertsDataType.Instance, WidgetType.forAnnotatedWidget(AlertsWidget.class));
  }
}
