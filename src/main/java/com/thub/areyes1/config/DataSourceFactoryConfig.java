/**
 * Class File Name: Datasource.java
 * Author: alvinreyes
 * Date Generate: Jun 28, 2015
 * Description
 */

package com.thub.areyes1.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import com.thub.areyes1.dao.BaseDao;
 

/**
 * The Class DataSourceFactoryConfig.
 */
@Configuration
@ComponentScan(basePackageClasses = {BaseDao.class})
public class DataSourceFactoryConfig {
	
	/**
	 * Gets the data source.
	 *
	 * @return the data source
	 */
	@Bean(name="dataSource")
	public DataSource getDataSource() {
		DriverManagerDataSource dm = new DriverManagerDataSource();
		dm.setDriverClassName("org.sqlite.JDBC");
		dm.setUrl("jdbc:sqlite:" + System.getProperty("DB_LOCATION"));
		return dm;
	}
}
