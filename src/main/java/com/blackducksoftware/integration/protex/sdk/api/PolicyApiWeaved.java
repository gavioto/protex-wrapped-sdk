/*******************************************************************************
 * Copyright (C) 2016 Black Duck Software, Inc.
 * http://www.blackducksoftware.com/
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 *******************************************************************************/
package com.blackducksoftware.integration.protex.sdk.api;

import java.util.List;

import com.blackducksoftware.sdk.fault.SdkFault;
import com.blackducksoftware.sdk.protex.common.AnalysisDatabaseOptions;
import com.blackducksoftware.sdk.protex.common.CaptureOptions;
import com.blackducksoftware.sdk.protex.common.CodeLabelOption;
import com.blackducksoftware.sdk.protex.common.FileDiscoveryPattern;
import com.blackducksoftware.sdk.protex.common.FileDiscoveryPatternPageFilter;
import com.blackducksoftware.sdk.protex.common.FileDiscoveryPatternRequest;
import com.blackducksoftware.sdk.protex.common.IdentificationOptions;
import com.blackducksoftware.sdk.protex.common.LearnedIdentification;
import com.blackducksoftware.sdk.protex.common.LearnedIdentificationPageFilter;
import com.blackducksoftware.sdk.protex.common.PatternOriginType;
import com.blackducksoftware.sdk.protex.common.RapidIdConfiguration;
import com.blackducksoftware.sdk.protex.common.RapidIdConfigurationRequest;
import com.blackducksoftware.sdk.protex.common.StringSearchPattern;
import com.blackducksoftware.sdk.protex.common.StringSearchPatternOriginType;
import com.blackducksoftware.sdk.protex.common.StringSearchPatternPageFilter;
import com.blackducksoftware.sdk.protex.common.StringSearchPatternRequest;
import com.blackducksoftware.sdk.protex.license.GlobalLicense;
import com.blackducksoftware.sdk.protex.policy.PolicyApi;
import com.blackducksoftware.sdk.protex.policy.ProtexSystemInformation;
import com.blackducksoftware.sdk.protex.policy.SourceCodeUploadRequest;
import com.blackducksoftware.sdk.protex.project.AnalysisSourceLocation;

public class PolicyApiWeaved extends WeavedApi<PolicyApi> implements PolicyApi {

    public PolicyApiWeaved(PolicyApi api) {
        super(api);
    }

    @Override
    public void associateRapidIdConfiguration(String arg0,
            Long arg1) throws SdkFault {
        getApi().associateRapidIdConfiguration(arg0, arg1);
    }

    @Override
    public String createFileDiscoveryPattern(FileDiscoveryPatternRequest arg0)
            throws SdkFault {
        return getApi().createFileDiscoveryPattern(arg0);
    }

    @Override
    public Long createRapidIdConfiguration(RapidIdConfigurationRequest arg0)
            throws SdkFault {
        return getApi().createRapidIdConfiguration(arg0);
    }

    @Override
    public String createStringSearchPattern(StringSearchPatternRequest arg0)
            throws SdkFault {
        return getApi().createStringSearchPattern(arg0);
    }

    @Override
    public void deleteFileDiscoveryPattern(String arg0) throws SdkFault {
        getApi().deleteFileDiscoveryPattern(arg0);
    }

    @Override
    public void deleteRapidIdConfiguration(Long arg0) throws SdkFault {
        getApi().deleteRapidIdConfiguration(arg0);
    }

    @Override
    public void deleteStringSearchPattern(String arg0) throws SdkFault {
        getApi().deleteStringSearchPattern(arg0);
    }

    @Override
    public void dissociateRapidIdConfiguration(String arg0,
            Long arg1) throws SdkFault {
        getApi().dissociateRapidIdConfiguration(arg0, arg1);
    }

    @Override
    public AnalysisDatabaseOptions getAnalysisDatabaseOptions() throws SdkFault {
        return getApi().getAnalysisDatabaseOptions();
    }

    @Override
    public Boolean getAnonymousAccessPolicy() throws SdkFault {
        return getApi().getAnonymousAccessPolicy();
    }

    @Override
    public CaptureOptions getCaptureOptions() throws SdkFault {
        return getApi().getCaptureOptions();
    }

    @Override
    public CodeLabelOption getCodeLabelOption() throws SdkFault {
        return getApi().getCodeLabelOption();
    }

    @Override
    public GlobalLicense getDefaultOpenSourceLicense() throws SdkFault {
        return getApi().getDefaultOpenSourceLicense();
    }

    @Override
    public GlobalLicense getDefaultProprietaryLicense() throws SdkFault {
        return getApi().getDefaultProprietaryLicense();
    }

    @Override
    public FileDiscoveryPattern getFileDiscoveryPatternById(String arg0) throws SdkFault {
        return getApi().getFileDiscoveryPatternById(arg0);
    }

    @Override
    public FileDiscoveryPattern getFileDiscoveryPatternByPattern(String arg0) throws SdkFault {
        return getApi().getFileDiscoveryPatternByPattern(arg0);
    }

    @Override
    public List<FileDiscoveryPattern> getFileDiscoveryPatterns(List<PatternOriginType> arg0,
            FileDiscoveryPatternPageFilter arg1) throws SdkFault {
        return getApi().getFileDiscoveryPatterns(arg0, arg1);
    }

    @Override
    public IdentificationOptions getIdentificationOptions() throws SdkFault {
        return getApi().getIdentificationOptions();
    }

    @Override
    public List<LearnedIdentification> getLearnedIdentifications(LearnedIdentificationPageFilter arg0)
            throws SdkFault {
        return getApi().getLearnedIdentifications(arg0);
    }

    @Override
    public Boolean getProjectSynchronizationOption() throws SdkFault {
        return getApi().getProjectSynchronizationOption();
    }

    @Override
    public List<String> getRapidIdConfigurationAssociations(Long arg0) throws SdkFault {
        return getApi().getRapidIdConfigurationAssociations(arg0);
    }

    @Override
    public RapidIdConfiguration getRapidIdConfigurationById(Long arg0) throws SdkFault {
        return getApi().getRapidIdConfigurationById(arg0);
    }

    @Override
    public RapidIdConfiguration getRapidIdConfigurationByName(String arg0) throws SdkFault {
        return getApi().getRapidIdConfigurationByName(arg0);
    }

    @Override
    public List<RapidIdConfiguration> getRapidIdConfigurations() throws SdkFault {
        return getApi().getRapidIdConfigurations();
    }

    @Override
    public Boolean getRapidIdentificationOption() throws SdkFault {
        return getApi().getRapidIdentificationOption();
    }

    @Override
    public Boolean getRegistrationLinkOption() throws SdkFault {
        return getApi().getRegistrationLinkOption();
    }

    @Override
    public Boolean getServerFileAccessOption() throws SdkFault {
        return getApi().getServerFileAccessOption();
    }

    @Override
    public StringSearchPattern getStringSearchPatternById(String arg0) throws SdkFault {
        return getApi().getStringSearchPatternById(arg0);
    }

    @Override
    public StringSearchPattern getStringSearchPatternByName(String arg0) throws SdkFault {
        return getApi().getStringSearchPatternByName(arg0);
    }

    @Override
    public List<StringSearchPattern> getStringSearchPatternsByType(StringSearchPatternOriginType arg0)
            throws SdkFault {
        return getApi().getStringSearchPatternsByType(arg0);
    }

    @Override
    public ProtexSystemInformation getSystemInformation() throws SdkFault {
        return getApi().getSystemInformation();
    }

    @Override
    public void removeLearnedIdentification(Long arg0) throws SdkFault {
        getApi().removeLearnedIdentification(arg0);
    }

    @Override
    public void resetFileDiscoveryPattern(String arg0) throws SdkFault {
        getApi().resetFileDiscoveryPattern(arg0);
    }

    @Override
    public void setDefaultOpenSourceLicense(String arg0) throws SdkFault {
        getApi().setDefaultOpenSourceLicense(arg0);
    }

    @Override
    public void setDefaultProprietaryLicense(String arg0) throws SdkFault {
        getApi().setDefaultProprietaryLicense(arg0);
    }

    @Override
    public List<FileDiscoveryPattern> suggestFileDiscoveryPatterns(String arg0,
            FileDiscoveryPatternPageFilter arg1) throws SdkFault {
        return getApi().suggestFileDiscoveryPatterns(arg0, arg1);
    }

    @Override
    public List<StringSearchPattern> suggestStringSearchPatterns(String arg0,
            StringSearchPatternPageFilter arg1) throws SdkFault {
        return getApi().suggestStringSearchPatterns(arg0, arg1);
    }

    @Override
    public void updateAnalysisDatabaseOptions(AnalysisDatabaseOptions arg0) throws SdkFault {
        getApi().updateAnalysisDatabaseOptions(arg0);
    }

    @Override
    public void updateAnonymousAccessPolicy(Boolean arg0) throws SdkFault {
        getApi().updateAnonymousAccessPolicy(arg0);
    }

    @Override
    public void updateCaptureOptions(CaptureOptions arg0) throws SdkFault {
        getApi().updateCaptureOptions(arg0);
    }

    @Override
    public void updateCodeLabelOption(CodeLabelOption arg0) throws SdkFault {
        getApi().updateCodeLabelOption(arg0);
    }

    // @Override
    // public void updateFileDiscoveryPattern(FileDiscoveryPattern arg0) throws SdkFault {
    // getApi().updateFileDiscoveryPattern(arg0);
    // }

    @Override
    public void updateIdentificationOptions(IdentificationOptions arg0) throws SdkFault {
        getApi().updateIdentificationOptions(arg0);
    }

    @Override
    public void updateProjectSynchronizationOption(Boolean arg0) throws SdkFault {
        getApi().updateProjectSynchronizationOption(arg0);
    }

    @Override
    public void updateRapidIdentificationOption(Boolean arg0) throws SdkFault {
        getApi().updateRapidIdentificationOption(arg0);
    }

    @Override
    public void updateRegistrationLinkOption(Boolean arg0) throws SdkFault {
        getApi().updateRegistrationLinkOption(arg0);
    }

    @Override
    public void updateServerFileAccessOption(Boolean arg0) throws SdkFault {
        getApi().updateServerFileAccessOption(arg0);
    }

    @Override
    public void updateFileDiscoveryPattern(String arg0, FileDiscoveryPatternRequest arg1) throws SdkFault {
        getApi().updateFileDiscoveryPattern(arg0, arg1);
    }

    @Override
    public void updateRapidIdConfiguration(Long arg0, RapidIdConfigurationRequest arg1) throws SdkFault {
        getApi().updateRapidIdConfiguration(arg0, arg1);
    }

    @Override
    public void updateStringSearchPattern(String arg0, StringSearchPatternRequest arg1) throws SdkFault {
        getApi().updateStringSearchPattern(arg0, arg1);
    }

    @Override
    public AnalysisSourceLocation uploadSourceArchive(SourceCodeUploadRequest arg0) throws SdkFault {
        return getApi().uploadSourceArchive(arg0);
    }

    // @Override
    // public void updateStringSearchPattern(StringSearchPattern arg0) throws SdkFault {
    // getApi().updateStringSearchPattern(arg0);
    // }

}
