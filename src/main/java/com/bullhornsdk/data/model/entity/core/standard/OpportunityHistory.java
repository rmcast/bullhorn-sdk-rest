package com.bullhornsdk.data.model.entity.core.standard;

import com.bullhornsdk.data.model.entity.core.type.AbstractEntity;
import com.bullhornsdk.data.model.entity.core.type.HardDeleteEntity;
import com.bullhornsdk.data.model.entity.core.type.QueryEntity;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;
import org.joda.time.DateTime;

import java.math.BigDecimal;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({ "id" })
public class OpportunityHistory extends AbstractEntity implements QueryEntity, HardDeleteEntity {

    private Integer id;

    private DateTime dateAdded;

    private BigDecimal dealValue;

    private DateTime effectiveDate;

    private String migrateGUID;

    private CorporateUser modifyingUser;

    private Opportunity opportunity;

    private String status;

    private BigDecimal weightedDealValue;

    private BigDecimal winProbabilityPercent;

    @Override
    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("dateAdded")
    public DateTime getDateAdded() {
        return dateAdded;
    }

    @JsonProperty("dateAdded")
    public void setDateAdded(DateTime dateAdded) {
        this.dateAdded = dateAdded;
    }

    @JsonProperty("dealValue")
    public BigDecimal getDealValue() {
        return dealValue;
    }

    @JsonProperty("dealValue")
    public void setDealValue(BigDecimal dealValue) {
        this.dealValue = dealValue;
    }

    @JsonProperty("effectiveDate")
    public DateTime getEffectiveDate() {
        return effectiveDate;
    }

    @JsonProperty("effectiveDate")
    public void setEffectiveDate(DateTime effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    @JsonProperty("migrateGUID")
    public String getMigrateGUID() {
        return migrateGUID;
    }

    @JsonProperty("migrateGUID")
    public void setMigrateGUID(String migrateGUID) {
        this.migrateGUID = migrateGUID;
    }

    @JsonProperty("modifyingUser")
    public CorporateUser getModifyingUser() {
        return modifyingUser;
    }

    @JsonProperty("modifyingUser")
    public void setModifyingUser(CorporateUser modifyingUser) {
        this.modifyingUser = modifyingUser;
    }

    @JsonProperty("opportunity")
    public Opportunity getOpportunity() {
        return opportunity;
    }

    @JsonProperty("opportunity")
    public void setOpportunity(Opportunity opportunity) {
        this.opportunity = opportunity;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("weightedDealValue")
    public BigDecimal getWeightedDealValue() {
        return weightedDealValue;
    }

    @JsonProperty("weightedDealValue")
    public void setWeightedDealValue(BigDecimal weightedDealValue) {
        this.weightedDealValue = weightedDealValue;
    }

    @JsonProperty("winProbabilityPercent")
    public BigDecimal getWinProbabilityPercent() {
        return winProbabilityPercent;
    }

    @JsonProperty("winProbabilityPercent")
    public void setWinProbabilityPercent(BigDecimal winProbabilityPercent) {
        this.winProbabilityPercent = winProbabilityPercent;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((dateAdded == null) ? 0 : dateAdded.hashCode());
        result = prime * result + ((dealValue == null) ? 0 : dealValue.hashCode());
        result = prime * result + ((effectiveDate == null) ? 0 : effectiveDate.hashCode());
        result = prime * result + ((migrateGUID == null) ? 0 : migrateGUID.hashCode());
        result = prime * result + ((modifyingUser == null) ? 0 : modifyingUser.hashCode());
        result = prime * result + ((opportunity == null) ? 0 : opportunity.hashCode());
        result = prime * result + ((status == null) ? 0 : status.hashCode());
        result = prime * result + ((weightedDealValue == null) ? 0 : weightedDealValue.hashCode());
        result = prime * result + ((winProbabilityPercent == null) ? 0 : winProbabilityPercent.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        OpportunityHistory other = (OpportunityHistory) obj;

        if (!Objects.equals(id, other.id)) return false;
        if (!Objects.equals(dateAdded, other.dateAdded)) return false;
        if (!Objects.equals(dealValue, other.dealValue)) return false;
        if (!Objects.equals(effectiveDate, other.effectiveDate)) return false;
        if (!Objects.equals(migrateGUID, other.migrateGUID)) return false;
        if (!Objects.equals(modifyingUser, other.modifyingUser)) return false;
        if (!Objects.equals(opportunity, other.opportunity)) return false;
        if (!Objects.equals(status, other.status)) return false;
        if (!Objects.equals(weightedDealValue, other.weightedDealValue)) return false;
        if (!Objects.equals(winProbabilityPercent, other.winProbabilityPercent)) return false;

        return true;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(getClass().getName());
        builder.append(" {\n\tid: ");
        builder.append(id);
        builder.append("\n\tdateAdded: ");
        builder.append(dateAdded);
        builder.append("\n\tdealValue: ");
        builder.append(dealValue);
        builder.append("\n\teffectiveDate: ");
        builder.append(effectiveDate);
        builder.append("\n\tmigrateGUID: ");
        builder.append(migrateGUID);
        builder.append("\n\tmodifyingUser: ");
        builder.append(modifyingUser);
        builder.append("\n\topportunity: ");
        builder.append(opportunity);
        builder.append("\n\tstatus: ");
        builder.append(status);
        builder.append("\n\tweightedDealValue: ");
        builder.append(weightedDealValue);
        builder.append("\n\twinProbabilityPercent: ");
        builder.append(winProbabilityPercent);
        builder.append("\n}");
        return builder.toString();
    }
}
