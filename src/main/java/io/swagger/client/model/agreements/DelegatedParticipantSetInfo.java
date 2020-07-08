/**
*  Copyright 2019 Adobe Systems Incorporated. All rights reserved.
*  This file is licensed to you under the Apache License, Version 2.0 (the "License");
*  you may not use this file except in compliance with the License. You may obtain a copy
*  of the License at http://www.apache.org/licenses/LICENSE-2.0
*
*  Unless required by applicable law or agreed to in writing, software distributed under
*  the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR REPRESENTATIONS
*  OF ANY KIND, either express or implied. See the License for the specific language
*  governing permissions and limitations under the License.
*
*
**/


/*
 * 
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 6.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model.agreements;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.agreements.DelegatedParticipantInfo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * DelegatedParticipantSetInfo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-11T15:48:52.659+05:30")
public class DelegatedParticipantSetInfo {
  @SerializedName("memberInfos")
  private List<DelegatedParticipantInfo> memberInfos = null;

  @SerializedName("privateMessage")
  private String privateMessage = null;

  public DelegatedParticipantSetInfo memberInfos(List<DelegatedParticipantInfo> memberInfos) {
    this.memberInfos = memberInfos;
    return this;
  }

  public DelegatedParticipantSetInfo addMemberInfosItem(DelegatedParticipantInfo memberInfosItem) {
    if (this.memberInfos == null) {
      this.memberInfos = new ArrayList<DelegatedParticipantInfo>();
    }
    this.memberInfos.add(memberInfosItem);
    return this;
  }

   /**
   * Array of ParticipantInfo objects, containing participant-specific data (e.g. email). All participants in the array belong to the same set
   * @return memberInfos
  **/
  @ApiModelProperty(value = "Array of ParticipantInfo objects, containing participant-specific data (e.g. email). All participants in the array belong to the same set")
  public List<DelegatedParticipantInfo> getMemberInfos() {
    return memberInfos;
  }

  public void setMemberInfos(List<DelegatedParticipantInfo> memberInfos) {
    this.memberInfos = memberInfos;
  }

  public DelegatedParticipantSetInfo privateMessage(String privateMessage) {
    this.privateMessage = privateMessage;
    return this;
  }

   /**
   * Participant set&#39;s private message - all participants in the set will receive the same message. This cannot be changed as part of the PUT call.
   * @return privateMessage
  **/
  @ApiModelProperty(value = "Participant set's private message - all participants in the set will receive the same message. This cannot be changed as part of the PUT call.")
  public String getPrivateMessage() {
    return privateMessage;
  }

  public void setPrivateMessage(String privateMessage) {
    this.privateMessage = privateMessage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DelegatedParticipantSetInfo delegatedParticipantSetInfo = (DelegatedParticipantSetInfo) o;
    return Objects.equals(this.memberInfos, delegatedParticipantSetInfo.memberInfos) &&
        Objects.equals(this.privateMessage, delegatedParticipantSetInfo.privateMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(memberInfos, privateMessage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DelegatedParticipantSetInfo {\n");
    
    sb.append("    memberInfos: ").append(toIndentedString(memberInfos)).append("\n");
    sb.append("    privateMessage: ").append(toIndentedString(privateMessage)).append("\n");
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

