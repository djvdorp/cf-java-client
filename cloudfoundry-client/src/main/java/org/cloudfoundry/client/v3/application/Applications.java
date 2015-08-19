/*
 * Copyright 2013-2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.cloudfoundry.client.v3.application;

import rx.Observable;

/**
 * Main entry point to the Cloud Foundry Applications Client API
 */
public interface Applications {

    /**
     * Makes the <a href="http://apidocs.cloudfoundry.org/214/apps_(experimental)/create_an_app.html">Create
     * Application</a> request
     *
     * @param request the Create Application request
     * @return the response from the Create Application request
     */
    Observable<CreateApplicationResponse> create(CreateApplicationRequest request);

    /**
     * Makes the <a href="http://apidocs.cloudfoundry.org/214/apps_(experimental)/delete_an_app.html">Delete
     * Application</a> request
     *
     * @param request the Delete Application request
     * @return the response from the Delete Application request
     */
    Observable<DeleteApplicationResponse> delete(DeleteApplicationRequest request);

    /**
     * Makes the <a href="http://apidocs.cloudfoundry.org/215/apps_(experimental)/get_an_app.html">Get Application</a>
     * request
     *
     * @param request the Get Application request
     * @return the response from the Get Application request
     */
    Observable<GetApplicationResponse> get(GetApplicationRequest request);

    /**
     * Makes the <a href="http://apidocs.cloudfoundry.org/214/apps_(experimental)/list_all_apps.html">List
     * Applications</a> request
     *
     * @param request the List Applications request
     * @return the response from the List Applications request
     */
    Observable<ListApplicationsResponse> list(ListApplicationsRequest request);

    /**
     * Makes the <a href="http://apidocs.cloudfoundry.org/214/apps_(experimental)/starting_an_app.html">Start
     * Application</a> request
     *
     * @param request the Start Application request
     * @return the response from the Start Application request
     */
    Observable<StartApplicationResponse> start(StartApplicationRequest request);

}
