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


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.PageInfo;
import io.swagger.client.model.UserInfo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * UsersInfo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-06T11:31:37.495+05:30")
public class UsersInfo {
  @SerializedName("page")
  private PageInfo page = null;

  @SerializedName("userInfoList")
  private List<UserInfo> userInfoList = null;

  public UsersInfo page(PageInfo page) {
    this.page = page;
    return this;
  }

   /**
   * Pagination information for navigating through the response
   * @return page
  **/
  @ApiModelProperty(value = "Pagination information for navigating through the response")
  public PageInfo getPage() {
    return page;
  }

  public void setPage(PageInfo page) {
    this.page = page;
  }

  public UsersInfo userInfoList(List<UserInfo> userInfoList) {
    this.userInfoList = userInfoList;
    return this;
  }

  public UsersInfo addUserInfoListItem(UserInfo userInfoListItem) {
    if (this.userInfoList == null) {
      this.userInfoList = new ArrayList<UserInfo>();
    }
    this.userInfoList.add(userInfoListItem);
    return this;
  }

   /**
   * The list of users in the account.
   * @return userInfoList
  **/
  @ApiModelProperty(value = "The list of users in the account.")
  public List<UserInfo> getUserInfoList() {
    return userInfoList;
  }

  public void setUserInfoList(List<UserInfo> userInfoList) {
    this.userInfoList = userInfoList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsersInfo usersInfo = (UsersInfo) o;
    return Objects.equals(this.page, usersInfo.page) &&
        Objects.equals(this.userInfoList, usersInfo.userInfoList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(page, userInfoList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsersInfo {\n");
    
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    userInfoList: ").append(toIndentedString(userInfoList)).append("\n");
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
