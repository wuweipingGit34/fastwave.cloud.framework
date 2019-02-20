package fastwave.client.admin.device.hystrix;

import java.util.Map;

import org.springframework.stereotype.Component;

import fastwave.client.admin.device.entity.StatusgroupStatus;
import fastwave.client.admin.device.feign.StatusgroupStatusFeign;
import fastwave.lib.common.web.PageDataUtils;
import fastwave.lib.common.web.R;

/**
 * 状态组包含的状态，字典数据，无需后台配置
 * 
 * @author fastwave.developer
 * @date 2018-05-25 13:56:09
 * @Copyright: 2018 fastwave. All rights reserved. 
 * 注意：本内容仅限于信翰创武汉物联科技有限公司内部传阅，禁止外泄以及用于其他的商业目
 */
@Component
public class StatusgroupStatusFallback implements StatusgroupStatusFeign{
	
	@Override
	public Map<String, Object> list(Map<String, Object> params) {
		return PageDataUtils.buildHystrixList(this);
	}
	
	@Override
	public R save(StatusgroupStatus statusgroupStatus) {
		return R.buildEmptyR("添加");
		
	}

	@Override
	public R update(StatusgroupStatus statusgroupStatus) {
		return R.buildEmptyR("更新");
	}

	@Override
	public R remove(Map<String, Object> params) {
		return R.buildEmptyR("删除");
	}

     @Override
	public Map<String, Object> view(Map<String, Object> params) {
		return PageDataUtils.buildHystrixRow("获取单条");
	}

}