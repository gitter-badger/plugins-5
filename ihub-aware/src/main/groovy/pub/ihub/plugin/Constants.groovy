/*
 * Copyright (c) 2021 Henry 李恒 (henry.box@outlook.com).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package pub.ihub.plugin

import static pub.ihub.plugin.IHubPluginMethods.of

/**
 * 常量
 * @author liheng
 */
final class Constants {

	static final String VALUE_TRUE = 'true'
	static final String VALUE_FALSE = 'false'

	//<editor-fold desc="Plugins插件相关">

	static final String GROOVY_GROUP_ID = 'org.codehaus.groovy'
	static final String GROOVY_VERSION = '3.0.8'

	static final List<Tuple3<String, String, String>> GROUP_MAVEN_BOM_VERSION_CONFIG = [
//		of('pub.ihub.lib'				, 'ihub-libs'							, '1.0.0-SNAPSHOT'		), TODO 由于GitHub仓库token只能个人使用，组件发布到中央仓库方可使用
		of(GROOVY_GROUP_ID					, 'groovy-bom'							, GROOVY_VERSION			),
		of('org.spockframework'			, 'spock-bom'							, '2.0-M5-groovy-3.0'	),
		of('org.springframework.boot'	, 'spring-boot-dependencies'			, '2.4.5'				),
		of('org.springframework.cloud'	, 'spring-cloud-dependencies'			, '2020.0.2'			),
		of('com.alibaba.cloud'			, 'spring-cloud-alibaba-dependencies'	, '2021.1'				),
		of('com.github.xiaoymin'		, 'knife4j-dependencies'				, '3.0.2'				),
		of('com.sun.xml.bind'			, 'jaxb-bom-ext'						, '3.0.1'				),
		of('de.codecentric'				, 'spring-boot-admin-dependencies'		, '2.4.1'				),
	]

	static final Map<String, String> GROUP_MAVEN_VERSION_CONFIG = [
		'cn.hutool': '5.6.4',
	]

	@SuppressWarnings('DuplicateStringLiteral')
	static final List<Tuple3<String, String, List<String>>> GROUP_DEPENDENCY_VERSION_CONFIG = [
		of(GROOVY_GROUP_ID				, GROOVY_VERSION	, ['groovy-all']),
		of('com.alibaba'			, '1.2.76'		, ['fastjson']),
		of('com.alibaba'			, '1.2.6'		, ['druid', 'druid-spring-boot-starter']),
		of('com.alibaba.p3c'		, '2.1.1'		, ['p3c-pmd']),
		of('com.baomidou'			, '3.4.2'		, ['mybatis-plus', 'mybatis-plus-boot-starter', 'mybatis-plus-generator']),
		of('com.github.xiaoymin'	, '2.0.8'		, ['knife4j-aggregation-spring-boot-starter']),
		of('com.athaydes'			, '2.0.1-RC3'	, ['spock-reports']),
	]

	/**
	 * TODO 重构BOM组件管理
	 */
	static final Map<String, List<String>> GROUP_DEPENDENCY_EXCLUDE_MAPPING = [
		'c3p0'                    : ['c3p0'],
		'commons-logging'         : ['commons-logging'],
		'com.zaxxer'              : ['HikariCP'],
		'log4j'                   : ['log4j'],
		'org.apache.logging.log4j': ['log4j-core'],
		'org.apache.tomcat'       : ['tomcat-jdbc'],
		'org.slf4j'               : ['slf4j-jcl', 'slf4j-log4j12'],
		'stax'                    : ['stax-api'],
	]

	static final Map<String, List<String>> GROUP_DEFAULT_DEPENDENCIES_MAPPING = [
		compileOnly          : ['cn.hutool:hutool-all'],
		implementation       : ['org.slf4j:slf4j-api'],
		api                  : [],
		runtimeOnly          : ['org.slf4j:jul-to-slf4j', /*'org.slf4j:jcl-over-slf4j', TODO 构建原生镜像有报错 */'org.slf4j:log4j-over-slf4j'],
		testImplementation   : [],
		debugImplementation  : [],
		releaseImplementation: [],
	]

	//</editor-fold>

}
