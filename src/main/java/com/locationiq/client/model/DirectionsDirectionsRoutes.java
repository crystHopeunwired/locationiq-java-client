/*
 * LocationIQ
 * LocationIQ provides flexible enterprise-grade location based solutions. We work with developers, startups and enterprises worldwide serving billions of requests everyday. This page provides an overview of the technical aspects of our API and will help you get started.
 *
 * The version of the OpenAPI document: 2.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.locationiq.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * DirectionsDirectionsRoutes
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-02-14T16:06:31.759327+05:30[Asia/Kolkata]")
public class DirectionsDirectionsRoutes {
  public static final String SERIALIZED_NAME_LEGS = "legs";
  @SerializedName(SERIALIZED_NAME_LEGS)
  private List<Object> legs = null;

  public static final String SERIALIZED_NAME_WEIGHT_NAME = "weight_name";
  @SerializedName(SERIALIZED_NAME_WEIGHT_NAME)
  private String weightName;

  public static final String SERIALIZED_NAME_GEOMETRY = "geometry";
  @SerializedName(SERIALIZED_NAME_GEOMETRY)
  private String geometry;

  public static final String SERIALIZED_NAME_WEIGHT = "weight";
  @SerializedName(SERIALIZED_NAME_WEIGHT)
  private BigDecimal weight;

  public static final String SERIALIZED_NAME_DISTANCE = "distance";
  @SerializedName(SERIALIZED_NAME_DISTANCE)
  private BigDecimal distance;

  public static final String SERIALIZED_NAME_DURATION = "duration";
  @SerializedName(SERIALIZED_NAME_DURATION)
  private BigDecimal duration;


  public DirectionsDirectionsRoutes legs(List<Object> legs) {
    
    this.legs = legs;
    return this;
  }

  public DirectionsDirectionsRoutes addLegsItem(Object legsItem) {
    if (this.legs == null) {
      this.legs = new ArrayList<Object>();
    }
    this.legs.add(legsItem);
    return this;
  }

   /**
   * Get legs
   * @return legs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Object> getLegs() {
    return legs;
  }


  public void setLegs(List<Object> legs) {
    this.legs = legs;
  }


  public DirectionsDirectionsRoutes weightName(String weightName) {
    
    this.weightName = weightName;
    return this;
  }

   /**
   * Get weightName
   * @return weightName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getWeightName() {
    return weightName;
  }


  public void setWeightName(String weightName) {
    this.weightName = weightName;
  }


  public DirectionsDirectionsRoutes geometry(String geometry) {
    
    this.geometry = geometry;
    return this;
  }

   /**
   * Get geometry
   * @return geometry
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGeometry() {
    return geometry;
  }


  public void setGeometry(String geometry) {
    this.geometry = geometry;
  }


  public DirectionsDirectionsRoutes weight(BigDecimal weight) {
    
    this.weight = weight;
    return this;
  }

   /**
   * Get weight
   * @return weight
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getWeight() {
    return weight;
  }


  public void setWeight(BigDecimal weight) {
    this.weight = weight;
  }


  public DirectionsDirectionsRoutes distance(BigDecimal distance) {
    
    this.distance = distance;
    return this;
  }

   /**
   * Get distance
   * @return distance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getDistance() {
    return distance;
  }


  public void setDistance(BigDecimal distance) {
    this.distance = distance;
  }


  public DirectionsDirectionsRoutes duration(BigDecimal duration) {
    
    this.duration = duration;
    return this;
  }

   /**
   * Get duration
   * @return duration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getDuration() {
    return duration;
  }


  public void setDuration(BigDecimal duration) {
    this.duration = duration;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DirectionsDirectionsRoutes directionsDirectionsRoutes = (DirectionsDirectionsRoutes) o;
    return Objects.equals(this.legs, directionsDirectionsRoutes.legs) &&
        Objects.equals(this.weightName, directionsDirectionsRoutes.weightName) &&
        Objects.equals(this.geometry, directionsDirectionsRoutes.geometry) &&
        Objects.equals(this.weight, directionsDirectionsRoutes.weight) &&
        Objects.equals(this.distance, directionsDirectionsRoutes.distance) &&
        Objects.equals(this.duration, directionsDirectionsRoutes.duration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(legs, weightName, geometry, weight, distance, duration);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DirectionsDirectionsRoutes {\n");
    sb.append("    legs: ").append(toIndentedString(legs)).append("\n");
    sb.append("    weightName: ").append(toIndentedString(weightName)).append("\n");
    sb.append("    geometry: ").append(toIndentedString(geometry)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("    distance: ").append(toIndentedString(distance)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

