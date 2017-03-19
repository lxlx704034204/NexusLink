package cn.nexuslink.dao.mapper;

import cn.nexuslink.model.ArticalModel;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**从数据库获得artical行所有数据，后续可转换成所需的ArticalMessageModel
 * Created by 罗浩 on 2017/3/18.
 */
public class articalMapper implements RowMapper<ArticalModel> {

    @Override
    public ArticalModel mapRow(ResultSet rs, int rowNum) throws SQLException {
        ArticalModel am = new ArticalModel();
        am.setId(rs.getInt("id"));
        am.setCategoryId(rs.getInt("cid"));
        am.setUserId(rs.getInt("uid"));
        am.setRole(rs.getInt("role"));
        am.setAuthor(rs.getString("author"));
        am.setTitle(rs.getString("title"));
        am.setLink(rs.getInt("link"));
        am.setUrl(rs.getString("url"));
        am.setCover(rs.getString("cover"));
        am.setStatus(rs.getInt("status"));
        am.setModelId(rs.getInt("model_id"));
        am.setPosition(rs.getInt("position"));
        am.setViewCount(rs.getInt("view_count"));
        am.setCommentCount(rs.getInt("comment_count"));
        am.setPublishDate(rs.getDate("publish_date"));
        am.setCopyFrom(rs.getString("copyfrom"));
        am.setContent(rs.getString("content"));
        am.setKeyWords(rs.getString("keywords"));
        am.setDescription(rs.getString("description"));
        am.setVoteId(rs.getInt("vote_id"));
        am.setComment(rs.getInt("comment"));
        am.setCreateAt(rs.getTimestamp("created_at"));
        am.setUpdateAt(rs.getTimestamp("updated_at"));
        return am;
    }
}
