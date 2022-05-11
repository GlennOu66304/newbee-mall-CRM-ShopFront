package ltd.newbee.mall.service;

import ltd.newbee.mall.entity.Carousel;
import ltd.newbee.mall.util.PageQueryUtil;
import ltd.newbee.mall.util.PageResult;

public interface NewBeeMallCarouselService {
    /**
     * 查询后台管理系统轮播图分页数据
     *
     * @param pageUtil
     * @return
     */
    PageResult getCarouselPage(PageQueryUtil pageUtil);

    /**
     * 新增一条轮播图记录
     *
     * @param carousel
     * @return
     */
    String saveCarousel(Carousel carousel);

    /**
     * 修改一条轮播图记录
     *
     * @param carousel
     * @return
     */
    String updateCarousel(Carousel carousel);

    /**
     * 根据主键查询轮播图记录
     *
     * @param id
     * @return
     */
    Carousel getCarouselById(Integer id);

    /**
     * 批量删除轮播图记录
     *
     * @param ids
     * @return
     */
    Boolean deleteBatch(Integer[] ids);
}
