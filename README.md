# shared-config1

This one is an example of configuration server for Spring Cloud.<br />
It uses directory to seperate application specified configurations.<br />
<br />
The common configurations are stored in application.yml in the root directory.<br />
The configurations for specified application are stored in application.yml under application directory.<br />
Please refer to app1 under the following sample directory structure as an example.<br /> 
<br />
The following are the configuration files structure:<br />
<br />
└─ application.yml<br />
└─ application-dev.yml<br />
└─ app1<br />
&nbsp;&emsp;&emsp;└─ application.yml<br />
&nbsp;&emsp;&emsp;└─ application-dev.yml<br />
└─ app2<br />
&nbsp;&emsp;&emsp;└─ application.yml<br />
&nbsp;&emsp;&emsp;└─ application-dev.yml<br />
