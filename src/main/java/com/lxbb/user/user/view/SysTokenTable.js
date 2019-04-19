import React, { Component } from "react"
import SearchArea from "widget/search-area"
import { Button, Divider, Popconfirm } from "antd"
import config from 'config'
import CustomTable from "widget/custom-table"
    
class SysTokenTable extends Component {
  constructor(props) {
    super(props);
    this.state = {
      searchForm: [
      {
          type: "input",
          id: "tenantId",
          placeholder: "请输入",
          label: "租户id",
          colSpan: 6
      },
      {
          type: "input",
          id: "token",
          placeholder: "请输入",
          label: "${column.comment}",
          colSpan: 6
      },
      {
          type: "input",
          id: "tokenState",
          placeholder: "请输入",
          label: "${column.comment}",
          colSpan: 6
      },
      {
          type: "input",
          id: "starDate",
          placeholder: "请输入",
          label: "${column.comment}",
          colSpan: 6
      },
      {
          type: "input",
          id: "endDate",
          placeholder: "请输入",
          label: "${column.comment}",
          colSpan: 6
      },
      {
          type: "input",
          id: "userId",
          placeholder: "请输入",
          label: "${column.comment}",
          colSpan: 6
      },
      {
          type: "input",
          id: "enableFlag",
          placeholder: "请输入",
          label: "启用标志",
          colSpan: 6
      },
      {
          type: "input",
          id: "deleteFlag",
          placeholder: "请输入",
          label: "删除标志",
          colSpan: 6
      },
      {
          type: "input",
          id: "createBy",
          placeholder: "请输入",
          label: "创建者",
          colSpan: 6
      },
      {
          type: "input",
          id: "createDate",
          placeholder: "请输入",
          label: "创建日期",
          colSpan: 6
      },
      {
          type: "input",
          id: "updateBy",
          placeholder: "请输入",
          label: "最近修改人",
          colSpan: 6
      },
      {
          type: "input",
          id: "updateDate",
          placeholder: "请输入",
          label: "最近修改日期",
          colSpan: 6
      },
      ],
      columns: [
        {
          title: "租户id",
          dataIndex: "tenantId",
          align: "center"
        },
        {
          title: "${column.comment}",
          dataIndex: "token",
          align: "center"
        },
        {
          title: "${column.comment}",
          dataIndex: "tokenState",
          align: "center"
        },
        {
          title: "${column.comment}",
          dataIndex: "starDate",
          align: "center"
        },
        {
          title: "${column.comment}",
          dataIndex: "endDate",
          align: "center"
        },
        {
          title: "${column.comment}",
          dataIndex: "userId",
          align: "center"
        },
        {
          title: "启用标志",
          dataIndex: "enableFlag",
          align: "center"
        },
        {
          title: "删除标志",
          dataIndex: "deleteFlag",
          align: "center"
        },
        {
          title: "创建者",
          dataIndex: "createBy",
          align: "center"
        },
        {
          title: "创建日期",
          dataIndex: "createDate",
          align: "center"
        },
        {
          title: "最近修改人",
          dataIndex: "updateBy",
          align: "center"
        },
        {
          title: "最近修改日期",
          dataIndex: "updateDate",
          align: "center"
        },
        {
          title: "操作",
          dataIndex: "id",
          align: "center",
          render: (value, record, index) => {
            return (<span>
              <a onClick={() => this.edit(record)}>编辑</a>
              <Divider type="vertical" />
              <Popconfirm title="确定删除？" onConfirm={() => this.delete(record.id)} okText="确定" cancelText="取消">
                <a>删除</a>
              </Popconfirm>
            </span>)
          }
        }
      ],
      searchParams: {},
      visibel: false,
      model: {}
    }
  }

  //搜索
  search = (values) => {
    this.setState({ searchParams: values, page: 0 }, () => {
      this.getList();
    });
  }

  //获取列表
  getList = () => {
    let { searchParams } = this.state;
    this.table.search(searchParams);
  }

  // 清除搜索条件
  empty = () => {
    this.search({});
  }

  render() {
    const { searchForm, columns, data, loading, visibel, pagination, model } = this.state;

    return (
      <div>
        <SearchArea
          searchForm={searchForm}
          submitHandle={this.search}
          clearHandle={this.empty}
        />
        <Button style={{ margin: "20px 0" }} className="create-btn" type="primary" onClick={this.create}>新建</Button>
        <CustomTable
          columns={columns}
          url={`${config.baseUrl}/api/sys/token/table/query`}
          ref={ref => this.table = ref}
        />
      </div>
    )
  }
}

export default SysTokenTable